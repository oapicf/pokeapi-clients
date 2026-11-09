//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:openapi/src/model/pokemon_move_version_group.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_move.g.dart';

/// PokemonMove
///
/// Properties:
/// * [move] - The move the Pokémon can learn.
/// * [versionGroupDetails] - The details of the version in which the Pokémon can learn the move.
@BuiltValue()
abstract class PokemonMove implements Built<PokemonMove, PokemonMoveBuilder> {
  /// The move the Pokémon can learn.
  @BuiltValueField(wireName: r'move')
  MoveSummary get move;

  /// The details of the version in which the Pokémon can learn the move.
  @BuiltValueField(wireName: r'version_group_details')
  BuiltList<PokemonMoveVersionGroup> get versionGroupDetails;

  PokemonMove._();

  factory PokemonMove([void updates(PokemonMoveBuilder b)]) = _$PokemonMove;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonMoveBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonMove> get serializer => _$PokemonMoveSerializer();
}

class _$PokemonMoveSerializer implements PrimitiveSerializer<PokemonMove> {
  @override
  final Iterable<Type> types = const [PokemonMove, _$PokemonMove];

  @override
  final String wireName = r'PokemonMove';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonMove object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'move';
    yield serializers.serialize(
      object.move,
      specifiedType: const FullType(MoveSummary),
    );
    yield r'version_group_details';
    yield serializers.serialize(
      object.versionGroupDetails,
      specifiedType: const FullType(BuiltList, [FullType(PokemonMoveVersionGroup)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonMove object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonMoveBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'move':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveSummary),
          ) as MoveSummary;
          result.move.replace(valueDes);
          break;
        case r'version_group_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonMoveVersionGroup)]),
          ) as BuiltList<PokemonMoveVersionGroup>;
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
  PokemonMove deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonMoveBuilder();
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


