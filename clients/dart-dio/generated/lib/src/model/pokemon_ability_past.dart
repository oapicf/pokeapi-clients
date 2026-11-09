//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_ability_past.g.dart';

/// PokemonAbilityPast
///
/// Properties:
/// * [isHidden] - Whether or not this is a hidden ability.
/// * [slot] - The slot this ability occupies in this Pokémon species.
/// * [ability] - The ability the Pokémon may have.
@BuiltValue()
abstract class PokemonAbilityPast implements Built<PokemonAbilityPast, PokemonAbilityPastBuilder> {
  /// Whether or not this is a hidden ability.
  @BuiltValueField(wireName: r'is_hidden')
  bool? get isHidden;

  /// The slot this ability occupies in this Pokémon species.
  @BuiltValueField(wireName: r'slot')
  int get slot;

  /// The ability the Pokémon may have.
  @BuiltValueField(wireName: r'ability')
  AbilitySummary? get ability;

  PokemonAbilityPast._();

  factory PokemonAbilityPast([void updates(PokemonAbilityPastBuilder b)]) = _$PokemonAbilityPast;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonAbilityPastBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonAbilityPast> get serializer => _$PokemonAbilityPastSerializer();
}

class _$PokemonAbilityPastSerializer implements PrimitiveSerializer<PokemonAbilityPast> {
  @override
  final Iterable<Type> types = const [PokemonAbilityPast, _$PokemonAbilityPast];

  @override
  final String wireName = r'PokemonAbilityPast';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonAbilityPast object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isHidden != null) {
      yield r'is_hidden';
      yield serializers.serialize(
        object.isHidden,
        specifiedType: const FullType(bool),
      );
    }
    yield r'slot';
    yield serializers.serialize(
      object.slot,
      specifiedType: const FullType(int),
    );
    yield r'ability';
    yield object.ability == null ? null : serializers.serialize(
      object.ability,
      specifiedType: const FullType.nullable(AbilitySummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonAbilityPast object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonAbilityPastBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_hidden':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isHidden = valueDes;
          break;
        case r'slot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.slot = valueDes;
          break;
        case r'ability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AbilitySummary),
          ) as AbilitySummary?;
          if (valueDes == null) continue;
          result.ability.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonAbilityPast deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonAbilityPastBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


