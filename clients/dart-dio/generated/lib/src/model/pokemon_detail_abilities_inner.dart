//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_abilities_inner.g.dart';

/// PokemonDetailAbilitiesInner
///
/// Properties:
/// * [ability] 
/// * [isHidden] 
/// * [slot] 
@BuiltValue()
abstract class PokemonDetailAbilitiesInner implements Built<PokemonDetailAbilitiesInner, PokemonDetailAbilitiesInnerBuilder> {
  @BuiltValueField(wireName: r'ability')
  AbilityDetailPokemonInnerPokemon get ability;

  @BuiltValueField(wireName: r'is_hidden')
  bool get isHidden;

  @BuiltValueField(wireName: r'slot')
  int get slot;

  PokemonDetailAbilitiesInner._();

  factory PokemonDetailAbilitiesInner([void updates(PokemonDetailAbilitiesInnerBuilder b)]) = _$PokemonDetailAbilitiesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailAbilitiesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailAbilitiesInner> get serializer => _$PokemonDetailAbilitiesInnerSerializer();
}

class _$PokemonDetailAbilitiesInnerSerializer implements PrimitiveSerializer<PokemonDetailAbilitiesInner> {
  @override
  final Iterable<Type> types = const [PokemonDetailAbilitiesInner, _$PokemonDetailAbilitiesInner];

  @override
  final String wireName = r'PokemonDetailAbilitiesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailAbilitiesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ability';
    yield serializers.serialize(
      object.ability,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'is_hidden';
    yield serializers.serialize(
      object.isHidden,
      specifiedType: const FullType(bool),
    );
    yield r'slot';
    yield serializers.serialize(
      object.slot,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailAbilitiesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailAbilitiesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.ability.replace(valueDes);
          break;
        case r'is_hidden':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isHidden = valueDes;
          break;
        case r'slot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.slot = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetailAbilitiesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailAbilitiesInnerBuilder();
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

