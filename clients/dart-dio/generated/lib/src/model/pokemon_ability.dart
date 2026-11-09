//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_ability.g.dart';

/// PokemonAbility
///
/// Properties:
/// * [isHidden] - Whether or not this is a hidden ability.
/// * [slot] - The slot this ability occupies in this Pokémon species.
/// * [ability] - The ability the Pokémon may have.
@BuiltValue()
abstract class PokemonAbility implements Built<PokemonAbility, PokemonAbilityBuilder> {
  /// Whether or not this is a hidden ability.
  @BuiltValueField(wireName: r'is_hidden')
  bool? get isHidden;

  /// The slot this ability occupies in this Pokémon species.
  @BuiltValueField(wireName: r'slot')
  int get slot;

  /// The ability the Pokémon may have.
  @BuiltValueField(wireName: r'ability')
  AbilitySummary get ability;

  PokemonAbility._();

  factory PokemonAbility([void updates(PokemonAbilityBuilder b)]) = _$PokemonAbility;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonAbilityBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonAbility> get serializer => _$PokemonAbilitySerializer();
}

class _$PokemonAbilitySerializer implements PrimitiveSerializer<PokemonAbility> {
  @override
  final Iterable<Type> types = const [PokemonAbility, _$PokemonAbility];

  @override
  final String wireName = r'PokemonAbility';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonAbility object, {
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
    yield serializers.serialize(
      object.ability,
      specifiedType: const FullType(AbilitySummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonAbility object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonAbilityBuilder result,
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
            specifiedType: const FullType(AbilitySummary),
          ) as AbilitySummary;
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
  PokemonAbility deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonAbilityBuilder();
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


