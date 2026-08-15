//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_detail_moves_inner_version_group_details_inner.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_moves_inner.g.dart';

/// PokemonDetailMovesInner
///
/// Properties:
/// * [move] 
/// * [versionGroupDetails] 
@BuiltValue()
abstract class PokemonDetailMovesInner implements Built<PokemonDetailMovesInner, PokemonDetailMovesInnerBuilder> {
  @BuiltValueField(wireName: r'move')
  AbilityDetailPokemonInnerPokemon get move;

  @BuiltValueField(wireName: r'version_group_details')
  BuiltList<PokemonDetailMovesInnerVersionGroupDetailsInner> get versionGroupDetails;

  PokemonDetailMovesInner._();

  factory PokemonDetailMovesInner([void updates(PokemonDetailMovesInnerBuilder b)]) = _$PokemonDetailMovesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailMovesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailMovesInner> get serializer => _$PokemonDetailMovesInnerSerializer();
}

class _$PokemonDetailMovesInnerSerializer implements PrimitiveSerializer<PokemonDetailMovesInner> {
  @override
  final Iterable<Type> types = const [PokemonDetailMovesInner, _$PokemonDetailMovesInner];

  @override
  final String wireName = r'PokemonDetailMovesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailMovesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'move';
    yield serializers.serialize(
      object.move,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'version_group_details';
    yield serializers.serialize(
      object.versionGroupDetails,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailMovesInnerVersionGroupDetailsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailMovesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailMovesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'move':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.move.replace(valueDes);
          break;
        case r'version_group_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailMovesInnerVersionGroupDetailsInner)]),
          ) as BuiltList<PokemonDetailMovesInnerVersionGroupDetailsInner>;
          result.versionGroupDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetailMovesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailMovesInnerBuilder();
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

